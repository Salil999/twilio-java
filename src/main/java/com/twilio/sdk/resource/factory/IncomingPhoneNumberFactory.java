package com.twilio.sdk.resource.factory;

import java.util.Map;
import java.util.List;

import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.instance.IncomingPhoneNumber;
import org.apache.http.NameValuePair;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating IncomingPhoneNumber objects.
 */
public interface IncomingPhoneNumberFactory {

	/**
	 * Creates the IncomingPhoneNumber
	 *
	 * @param params the params map
	 * @return the incoming phone number
	 * @throws TwilioRestException
	 */
	public IncomingPhoneNumber create(Map<String, String> params) throws TwilioRestException;

	/**
	 * Creates the IncomingPhoneNumber
	 *
	 * @param params the param list
	 * @return the incoming phone number
	 * @throws TwilioRestException
	 */
	public IncomingPhoneNumber create(List<NameValuePair> params) throws TwilioRestException;
}
