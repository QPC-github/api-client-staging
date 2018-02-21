// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface ListJobTriggersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.ListJobTriggersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to ListJobTriggers. `order_by` and `filter` should not change for
   * subsequent calls, but can be omitted if token is specified.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to ListJobTriggers. `order_by` and `filter` should not change for
   * subsequent calls, but can be omitted if token is specified.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional size of the page, can be limited by a server.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional comma separated list of triggeredJob fields to order by,
   * followed by 'asc/desc' postfix, i.e.
   * `"create_time asc,name desc,schedule_mode asc"`. This list is
   * case-insensitive.
   * Example: `"name asc,schedule_mode desc, status desc"`
   * Supported filters keys and values are:
   * - `create_time`: corresponds to time the triggeredJob was created.
   * - `update_time`: corresponds to time the triggeredJob was last updated.
   * - `name`: corresponds to JobTrigger's display name.
   * - `status`: corresponds to the triggeredJob status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional comma separated list of triggeredJob fields to order by,
   * followed by 'asc/desc' postfix, i.e.
   * `"create_time asc,name desc,schedule_mode asc"`. This list is
   * case-insensitive.
   * Example: `"name asc,schedule_mode desc, status desc"`
   * Supported filters keys and values are:
   * - `create_time`: corresponds to time the triggeredJob was created.
   * - `update_time`: corresponds to time the triggeredJob was last updated.
   * - `name`: corresponds to JobTrigger's display name.
   * - `status`: corresponds to the triggeredJob status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
