<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/oslogin/v1alpha/oslogin.proto

namespace Google\Cloud\Oslogin\V1alpha;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A response message for importing an SSH public key.
 *
 * Generated from protobuf message <code>google.cloud.oslogin.v1alpha.ImportSshPublicKeyResponse</code>
 */
class ImportSshPublicKeyResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * The login profile information for the user.
     *
     * Generated from protobuf field <code>.google.cloud.oslogin.v1alpha.LoginProfile login_profile = 1;</code>
     */
    private $login_profile = null;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Oslogin\V1Alpha\Oslogin::initOnce();
        parent::__construct();
    }

    /**
     * The login profile information for the user.
     *
     * Generated from protobuf field <code>.google.cloud.oslogin.v1alpha.LoginProfile login_profile = 1;</code>
     * @return \Google\Cloud\Oslogin\V1alpha\LoginProfile
     */
    public function getLoginProfile()
    {
        return $this->login_profile;
    }

    /**
     * The login profile information for the user.
     *
     * Generated from protobuf field <code>.google.cloud.oslogin.v1alpha.LoginProfile login_profile = 1;</code>
     * @param \Google\Cloud\Oslogin\V1alpha\LoginProfile $var
     * @return $this
     */
    public function setLoginProfile($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Oslogin\V1alpha\LoginProfile::class);
        $this->login_profile = $var;

        return $this;
    }

}

