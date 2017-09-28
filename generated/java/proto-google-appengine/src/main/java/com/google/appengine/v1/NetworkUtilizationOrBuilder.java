// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public interface NetworkUtilizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.NetworkUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Target bytes sent per second.
   * </pre>
   *
   * <code>optional int32 target_sent_bytes_per_second = 1;</code>
   */
  int getTargetSentBytesPerSecond();

  /**
   * <pre>
   * Target packets sent per second.
   * </pre>
   *
   * <code>optional int32 target_sent_packets_per_second = 11;</code>
   */
  int getTargetSentPacketsPerSecond();

  /**
   * <pre>
   * Target bytes received per second.
   * </pre>
   *
   * <code>optional int32 target_received_bytes_per_second = 12;</code>
   */
  int getTargetReceivedBytesPerSecond();

  /**
   * <pre>
   * Target packets received per second.
   * </pre>
   *
   * <code>optional int32 target_received_packets_per_second = 13;</code>
   */
  int getTargetReceivedPacketsPerSecond();
}