package org.example.rag;

import org.springframework.ai.document.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TaskRagRetrivalController {




        @Autowired
        private A2ARagService vectorService;

        @GetMapping("/getDocuments")
        public List<Document> getDocument(@RequestParam("documentText") String documentText) {

            return vectorService.getSimilarDocuments(documentText);
        }
}
