package org.owntracks.android.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.owntracks.android.support.IncomingMessageProcessor;
import org.owntracks.android.support.OutgoingMessageProcessor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MessageEvent extends MessageBase{
    static final String TYPE = "event";
    private static final String BASETOPIC_SUFFIX = "/event";
    public String getBaseTopicSuffix() {  return BASETOPIC_SUFFIX; }
    @Override
    public void processIncomingMessage(IncomingMessageProcessor handler) {
        handler.processIncomingMessage(this);
    }

    @Override
    public void processOutgoingMessage(OutgoingMessageProcessor handler) {
        handler.processOutgoingMessage(this);
    }

}
