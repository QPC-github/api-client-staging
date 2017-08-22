// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public final class SpannerInstanceAdminProto {
  private SpannerInstanceAdminProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/spanner/admin/instance/v1/spann" +
      "er_instance_admin.proto\022 google.spanner." +
      "admin.instance.v1\032\034google/api/annotation" +
      "s.proto\032\025google/api/auth.proto\032\036google/i" +
      "am/v1/iam_policy.proto\032\032google/iam/v1/po" +
      "licy.proto\032#google/longrunning/operation" +
      "s.proto\032\033google/protobuf/empty.proto\032 go" +
      "ogle/protobuf/field_mask.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"4\n\016InstanceConfi" +
      "g\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\"\303\002",
      "\n\010Instance\022\014\n\004name\030\001 \001(\t\022\016\n\006config\030\002 \001(\t" +
      "\022\024\n\014display_name\030\003 \001(\t\022\022\n\nnode_count\030\005 \001" +
      "(\005\022?\n\005state\030\006 \001(\01620.google.spanner.admin" +
      ".instance.v1.Instance.State\022F\n\006labels\030\007 " +
      "\003(\01326.google.spanner.admin.instance.v1.I" +
      "nstance.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"7\n\005State\022\025\n\021S" +
      "TATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READ" +
      "Y\020\002\"S\n\032ListInstanceConfigsRequest\022\016\n\006par" +
      "ent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok",
      "en\030\003 \001(\t\"\202\001\n\033ListInstanceConfigsResponse" +
      "\022J\n\020instance_configs\030\001 \003(\01320.google.span" +
      "ner.admin.instance.v1.InstanceConfig\022\027\n\017" +
      "next_page_token\030\002 \001(\t\"(\n\030GetInstanceConf" +
      "igRequest\022\014\n\004name\030\001 \001(\t\"\"\n\022GetInstanceRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"z\n\025CreateInstanceReq" +
      "uest\022\016\n\006parent\030\001 \001(\t\022\023\n\013instance_id\030\002 \001(" +
      "\t\022<\n\010instance\030\003 \001(\0132*.google.spanner.adm" +
      "in.instance.v1.Instance\"]\n\024ListInstances" +
      "Request\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001",
      "(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"o" +
      "\n\025ListInstancesResponse\022=\n\tinstances\030\001 \003" +
      "(\0132*.google.spanner.admin.instance.v1.In" +
      "stance\022\027\n\017next_page_token\030\002 \001(\t\"\205\001\n\025Upda" +
      "teInstanceRequest\022<\n\010instance\030\001 \001(\0132*.go" +
      "ogle.spanner.admin.instance.v1.Instance\022" +
      ".\n\nfield_mask\030\002 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\"%\n\025DeleteInstanceRequest\022\014\n\004name" +
      "\030\001 \001(\t\"\345\001\n\026CreateInstanceMetadata\022<\n\010ins" +
      "tance\030\001 \001(\0132*.google.spanner.admin.insta",
      "nce.v1.Instance\022.\n\nstart_time\030\002 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\022/\n\013cancel_time\030\003" +
      " \001(\0132\032.google.protobuf.Timestamp\022,\n\010end_" +
      "time\030\004 \001(\0132\032.google.protobuf.Timestamp\"\345" +
      "\001\n\026UpdateInstanceMetadata\022<\n\010instance\030\001 " +
      "\001(\0132*.google.spanner.admin.instance.v1.I" +
      "nstance\022.\n\nstart_time\030\002 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022/\n\013cancel_time\030\003 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022,\n\010end_time\030\004 \001" +
      "(\0132\032.google.protobuf.Timestamp2\346\014\n\rInsta",
      "nceAdmin\022\303\001\n\023ListInstanceConfigs\022<.googl" +
      "e.spanner.admin.instance.v1.ListInstance" +
      "ConfigsRequest\032=.google.spanner.admin.in" +
      "stance.v1.ListInstanceConfigsResponse\"/\202" +
      "\323\344\223\002)\022\'/v1/{parent=projects/*}/instanceC" +
      "onfigs\022\262\001\n\021GetInstanceConfig\022:.google.sp" +
      "anner.admin.instance.v1.GetInstanceConfi" +
      "gRequest\0320.google.spanner.admin.instance" +
      ".v1.InstanceConfig\"/\202\323\344\223\002)\022\'/v1/{name=pr" +
      "ojects/*/instanceConfigs/*}\022\253\001\n\rListInst",
      "ances\0226.google.spanner.admin.instance.v1" +
      ".ListInstancesRequest\0327.google.spanner.a" +
      "dmin.instance.v1.ListInstancesResponse\")" +
      "\202\323\344\223\002#\022!/v1/{parent=projects/*}/instance" +
      "s\022\232\001\n\013GetInstance\0224.google.spanner.admin" +
      ".instance.v1.GetInstanceRequest\032*.google" +
      ".spanner.admin.instance.v1.Instance\")\202\323\344" +
      "\223\002#\022!/v1/{name=projects/*/instances/*}\022\226" +
      "\001\n\016CreateInstance\0227.google.spanner.admin" +
      ".instance.v1.CreateInstanceRequest\032\035.goo",
      "gle.longrunning.Operation\",\202\323\344\223\002&\"!/v1/{" +
      "parent=projects/*}/instances:\001*\022\237\001\n\016Upda" +
      "teInstance\0227.google.spanner.admin.instan" +
      "ce.v1.UpdateInstanceRequest\032\035.google.lon" +
      "grunning.Operation\"5\202\323\344\223\002/2*/v1/{instanc" +
      "e.name=projects/*/instances/*}:\001*\022\214\001\n\016De" +
      "leteInstance\0227.google.spanner.admin.inst" +
      "ance.v1.DeleteInstanceRequest\032\026.google.p" +
      "rotobuf.Empty\")\202\323\344\223\002#*!/v1/{name=project" +
      "s/*/instances/*}\022\210\001\n\014SetIamPolicy\022\".goog",
      "le.iam.v1.SetIamPolicyRequest\032\025.google.i" +
      "am.v1.Policy\"=\202\323\344\223\0027\"2/v1/{resource=proj" +
      "ects/*/instances/*}:setIamPolicy:\001*\022\210\001\n\014" +
      "GetIamPolicy\022\".google.iam.v1.GetIamPolic" +
      "yRequest\032\025.google.iam.v1.Policy\"=\202\323\344\223\0027\"" +
      "2/v1/{resource=projects/*/instances/*}:g" +
      "etIamPolicy:\001*\022\256\001\n\022TestIamPermissions\022(." +
      "google.iam.v1.TestIamPermissionsRequest\032" +
      ").google.iam.v1.TestIamPermissionsRespon" +
      "se\"C\202\323\344\223\002=\"8/v1/{resource=projects/*/ins",
      "tances/*}:testIamPermissions:\001*B\266\001\n$com." +
      "google.spanner.admin.instance.v1B\031Spanne" +
      "rInstanceAdminProtoP\001ZHgoogle.golang.org" +
      "/genproto/googleapis/spanner/admin/insta" +
      "nce/v1;instance\252\002&Google.Cloud.Spanner.A" +
      "dmin.Instance.V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.AuthProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", });
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "Config", "DisplayName", "NodeCount", "State", "Labels", });
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor =
      internal_static_google_spanner_admin_instance_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor,
        new java.lang.String[] { "InstanceConfigs", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor,
        new java.lang.String[] { "Parent", "InstanceId", "Instance", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor,
        new java.lang.String[] { "Instances", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor,
        new java.lang.String[] { "Instance", "FieldMask", });
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.AuthProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}