package org.example.rag;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.vishalmysore.a2a.domain.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.ai.vectorstore.filter.Filter;
import org.springframework.ai.vectorstore.filter.FilterExpressionBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@Slf4j
public class A2ARagService {

    @Autowired
    private VectorStore vectorStore;

    @Autowired
    ObjectStringSummarizer summarizer;

    public void addTask(Object task) {
        String summary = summarizer.summarize(task.toString());
        log.info("Adding task to vector store: " + summary);
        vectorStore.add(List.of(new Document(task.toString())));
    }
    public void storeData(Object task) {
        String summary = summarizer.summarize(task.toString());
        log.info("Adding task to vector store: " + summary);
        vectorStore.add(List.of(new Document(task.toString())));
    }

    public List<Document> getSimilarDocuments(String taskText) {

        List<Document> results = vectorStore.similaritySearch(SearchRequest.builder().query(taskText).topK(1).build());
        //you can do additional processing here if needed
        return results;
    }




    }
