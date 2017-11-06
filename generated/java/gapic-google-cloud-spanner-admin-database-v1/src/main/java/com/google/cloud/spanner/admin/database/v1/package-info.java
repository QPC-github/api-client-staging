/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Spanner Database Admin API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=================== DatabaseAdminClient ===================
 *
 * <p>Service Description: Cloud Spanner Database Admin API
 *
 * <p>The Cloud Spanner Database Admin API can be used to create, drop, and list databases. It also
 * enables updating the schema of pre-existing databases.
 *
 * <p>Sample for DatabaseAdminClient:
 *
 * <pre>
 * <code>
 * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
 *   DatabaseName name = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
 *   Database response = databaseAdminClient.getDatabase(name);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.spanner.admin.database.v1;
