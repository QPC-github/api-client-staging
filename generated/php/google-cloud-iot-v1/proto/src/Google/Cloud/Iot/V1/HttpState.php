<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/iot/v1/resources.proto

namespace Google\Cloud\Iot\V1;

/**
 * Indicates whether DeviceService (HTTP) is enabled or disabled for the
 * registry. See the field description for details.
 *
 * Protobuf enum <code>Google\Cloud\Iot\V1\HttpState</code>
 */
class HttpState
{
    /**
     * No HTTP state specified. If not specified, DeviceService will be
     * enabled by default.
     *
     * Generated from protobuf enum <code>HTTP_STATE_UNSPECIFIED = 0;</code>
     */
    const HTTP_STATE_UNSPECIFIED = 0;
    /**
     * Enables DeviceService (HTTP) service for the registry.
     *
     * Generated from protobuf enum <code>HTTP_ENABLED = 1;</code>
     */
    const HTTP_ENABLED = 1;
    /**
     * Disables DeviceService (HTTP) service for the registry.
     *
     * Generated from protobuf enum <code>HTTP_DISABLED = 2;</code>
     */
    const HTTP_DISABLED = 2;
}
