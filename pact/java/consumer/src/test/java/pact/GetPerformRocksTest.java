package pact;

import au.com.dius.pact.consumer.*;
import au.com.dius.pact.model.PactFragment;
import org.junit.Rule;
import org.junit.Test;
import utils.Configuration;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GetPerformRocksTest
{
    @Rule
    public PactRule rule = new PactRule(Configuration.MOCK_HOST, Configuration.MOCK_HOST_PORT, this);
    private DslPart performRocksResults;

    @Pact(state = "PERFORM ROCKS", provider = Configuration.DUMMY_PROVIDER, consumer = Configuration.DUMMY_CONSUMER)
    public PactFragment createFragment(ConsumerPactBuilder.PactDslWithProvider.PactDslWithState builder)
    {
        performRocksResults = new PactDslJsonBody()
                .id()
                .stringType("content")
                .asBody();

        return builder
                .uponReceiving("get perform rocks response")
                .path("/perform-rocks")
                .method("GET")
                .willRespondWith()
                .status(200)
                .headers(Configuration.getHeaders())
                .body(performRocksResults)
                .toFragment();
    }

    @Test
    @PactVerification("PERFORM ROCKS")
    public void shouldGetPerformRocks() throws IOException
    {
        DummyConsumer restClient = new DummyConsumer(Configuration.SERVICE_URL);
        assertEquals(performRocksResults.toString(), restClient.getPerformRocks());
    }
}
