package org.meotppo.webti.job.reader;

import org.meotppo.webti.domain.entity.mongo.testresult.TestResult;
import org.springframework.batch.item.data.MongoPagingItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.util.Collections;

@Configuration
public class ReaderConfig {

    public static final String TEST_RESULT_READER = "testResultReader";

    @Bean(name = TEST_RESULT_READER)
    public MongoPagingItemReader<TestResult> testResultReader(MongoTemplate mongoTemplate) {
        MongoPagingItemReader<TestResult> reader = new MongoPagingItemReader<>();

        reader.setTemplate(mongoTemplate);
        reader.setPageSize(10);
        reader.setQuery(new Query());
        reader.setSort(Collections.singletonMap("createdAt", Sort.Direction.ASC));
        reader.setTargetType(TestResult.class);
        return reader;
    }
}
