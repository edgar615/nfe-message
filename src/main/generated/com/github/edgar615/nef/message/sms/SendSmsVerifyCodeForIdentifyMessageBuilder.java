package com.github.edgar615.nef.message.sms;

import com.github.edgar615.message.core.Event;
import com.github.edgar615.message.core.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CodeGen at Tue Nov 19 18:13:38 CST 2019
 * @author CodeGen
 */
public final class SendSmsVerifyCodeForIdentifyMessageBuilder {
  private static final String to = "v1.job.sms.verifycode.send";

  private static final Map<String, String> ext = new HashMap<>();

  private Long appId;

  private String phoneNumber;

  private String id;

  private String resource;

  private SendSmsVerifyCodeForIdentifyMessageBuilder() {
  }

  public static SendSmsVerifyCodeForIdentifyMessageBuilder builder() {
    return new SendSmsVerifyCodeForIdentifyMessageBuilder();
  }

  public SendSmsVerifyCodeForIdentifyMessageBuilder setAppId(Long appId) {
    this.appId = appId;
    return this;
  }

  public SendSmsVerifyCodeForIdentifyMessageBuilder setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public SendSmsVerifyCodeForIdentifyMessageBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public SendSmsVerifyCodeForIdentifyMessageBuilder addExt(String key, String value) {
    this.ext.put(key, value);
    return this;
  }

  public Message build() {
    Objects.requireNonNull(appId, "appId can not be null");
    Objects.requireNonNull(phoneNumber, "phoneNumber can not be null");
    Objects.requireNonNull(id, "id can not be null");
    Objects.requireNonNull(to, "to can not be null");
    Objects.requireNonNull(resource, "resource can not be null");
    Map<String, Object> content = new HashMap();
    content.put("appId", appId);
    content.put("phoneNumber", phoneNumber);
    Event body = Event.create(resource, content);
    Message message = Message.create(id, to, body);
    message.header().addExts(ext);
    return message;
  }
}
