package deep;

import java.util.*;
import java.io.*;

public class NewsStorage {
    private static final String NEWS_DIRECTORY = "D:\\labs\\kursova1\\src\\news_data";

    public List<News> getAllNews() {
        List<News> newsList = new ArrayList<>();
        File dir = new File(NEWS_DIRECTORY);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
                    String title = br.readLine();
                    String category = br.readLine();
                    StringBuilder contentBuilder = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        contentBuilder.append(line);
                    }
                    String content = contentBuilder.toString();
                    News news = new News(title, content, category);
                    newsList.add(news);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return newsList;
    }

    public List<News> searchNews(String keywords) {
        List<News> searchResults = new ArrayList<>();
        List<News> allNews = getAllNews();

        for (News news : allNews) {
            if (news.getTitle().toLowerCase().contains(keywords.toLowerCase()) ||
                    news.getContent().toLowerCase().contains(keywords.toLowerCase())) {
                searchResults.add(news);
            }
        }

        return searchResults;
    }

    public List<News> searchByCategory(String category) {
        List<News> searchResults = new ArrayList<>();
        List<News> allNews = getAllNews();

        for (News news : allNews) {
            if (news.getCategory().equalsIgnoreCase(category)) {
                searchResults.add(news);
            }
        }

        return searchResults;
    }

    public void addNews(String title, String content, String category) {
        String fileName = NEWS_DIRECTORY + "/" + title.replaceAll("\\s+", "_") + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"))) {
            bw.write(title + "\n");
            bw.write(category + "\n");
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
