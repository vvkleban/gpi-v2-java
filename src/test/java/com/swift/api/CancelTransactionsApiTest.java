/*
 * gpi API v2
 * Move your app forward with the gpi API
 *
 */

package com.swift.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.swift.ApiException;
import com.swift.model.CamtA0600102;
import com.swift.model.CamtA0600202;
import com.swift.model.ErrorCode;

import com.swift.ApiResponse;

import com.swift.model.CancelTransactionRequest;
import com.swift.model.CancellationReason6Code;
import com.swift.model.CancellationRequestDetails1;
import com.swift.model.PendingPaymentCancellationReason2Code;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancelTransactionsApi
 */
@Ignore
public class CancelTransactionsApiTest {




    /**
     * Cancel Transactions
     *
     * This API informs the tracker about the cancellation of a given transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTransactionsPostTest() throws ApiException {
    	 CancelTransactionsApi api = mock(CancelTransactionsApi.class);
    	 ApiResponse<CamtA0600202> mock_Response=(ApiResponse<CamtA0600202>)mock(ApiResponse.class);
		CamtA0600102 requestBody = new CamtA0600102();
		requestBody.setCancelTransactionRequest(new CancelTransactionRequest());
		requestBody.getCancelTransactionRequest().setFrom("");
		requestBody.getCancelTransactionRequest().setBusinessService("");
		requestBody.getCancelTransactionRequest().setCaseIdentification("");
		requestBody.getCancelTransactionRequest().setUetr("");
		requestBody.getCancelTransactionRequest().setOriginalInstructionIdentification("");
		requestBody.getCancelTransactionRequest().setUnderlyingCancellationDetails(new CancellationRequestDetails1());
		requestBody.getCancelTransactionRequest().getUnderlyingCancellationDetails()
				.setCancellationReasonInformation(CancellationReason6Code.AGNT);
		requestBody.getCancelTransactionRequest().getUnderlyingCancellationDetails()
				.setIndemnityAgreement(PendingPaymentCancellationReason2Code.INDM);

		when(api.cancelTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody)).thenReturn(mock_Response);

		Assert.assertEquals(api.cancelTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", true, "", requestBody),mock_Response);

		// Print response

    }

}
