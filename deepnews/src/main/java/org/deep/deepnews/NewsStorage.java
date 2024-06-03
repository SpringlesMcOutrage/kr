package org.deep.deepnews;


import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class NewsStorage {
    private static final String NEWS_DIRECTORY = "C:\\Users\\deep\\Desktop\\deepnews\\src\\news_data";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public List<News> getAllNews() {
        List<News> newsList = new ArrayList<>();
        File dir = new File(NEWS_DIRECTORY);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
                    String title = br.readLine();
                    String category = br.readLine();
                    String createdAtString = br.readLine();
                    Date createdAt = DATE_FORMAT.parse(createdAtString);
                    StringBuilder contentBuilder = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        contentBuilder.append(line);
                    }
                    String content = contentBuilder.toString();
                    News news = new News(title, content, category, createdAt);
                    newsList.add(news);
                } catch (IOException | java.text.ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        return newsList;
    }

    public List<News> searchNews(String keywords, String category) {
        Set<News> searchResults = new HashSet<>();
        List<News> allNews = getAllNews();

        for (News news : allNews) {
            if ((keywords == null || keywords.isEmpty() ||
                    news.getTitle().toLowerCase().contains(keywords.toLowerCase()) ||
                    news.getContent().toLowerCase().contains(keywords.toLowerCase())) &&
                    (category == null || category.isEmpty() ||
                            news.getCategory().equalsIgnoreCase(category))) {
                searchResults.add(news);
            }
        }

        return new ArrayList<>(searchResults);
    }

    public void addNews(String title, String content, String category) {
        String fileName = NEWS_DIRECTORY + "/" + title.replaceAll("\\s+", "_") + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"))) {
            bw.write(title + "\n");
            bw.write(category + "\n");
            bw.write(DATE_FORMAT.format(new Date()) + "\n");
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
