package com.ctrip.framework.apollo.exceptions;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ApolloConfigNullValueException extends RuntimeException {
  public ApolloConfigNullValueException(String message) {
    super(message);
  }

  public ApolloConfigNullValueException(String message, Throwable cause) {
    super(message, cause);
  }
}
