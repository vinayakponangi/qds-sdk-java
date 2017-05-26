/**
 * Copyright 2014- Qubole Inc.
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
package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.InvokableBuilder;
import com.qubole.qds.sdk.java.api.NotebookApi;
import com.qubole.qds.sdk.java.api.NotebookBuilder;
import com.qubole.qds.sdk.java.client.QdsClient;
import com.qubole.qds.sdk.java.entities.Notebook;
import com.qubole.qds.sdk.java.entities.Status;

class NotebookApiImpl implements NotebookApi
{
    private final QdsClient client;

    @Override public InvokableBuilder<Notebook> create(NotebookBuilder notebook) {
        RequestDetails entity = new RequestDetails(notebook.toString(), RequestDetails.Method.POST);
        return new GenericInvokableBuilderImpl<Notebook>(client, entity, Notebook.class, "notebook");
    }

    @Override public InvokableBuilder<Notebook> configure(int dbTapId, NotebookBuilder dbTap) {
        return null;
    }

    @Override public InvokableBuilder<Notebook> clone() {
        return null;
    }

    @Override public InvokableBuilder<Notebook> bind(int dbTapId) {
        return null;
    }

    @Override public InvokableBuilder<Notebook> run(int dbTapId) {
        return null;
    }

    @Override public InvokableBuilder<Status> delete(int dbTapId) {
        return null;
    }

    @Override public NotebookBuilder notebook() {
        return null;
    }

    //    @Override
//    public InvokableBuilder<DbTap> create(DbTapBuilder dbTap)
//    {
//        RequestDetails entity = new RequestDetails(dbTap.toString(), RequestDetails.Method.POST);
//        return new GenericInvokableBuilderImpl<DbTap>(client, entity, DbTap.class, "db_taps");
//    }
//
//    @Override
//    public InvokableBuilder<DbTap> edit(int dbTapId, DbTapBuilder dbTap)
//    {
//        RequestDetails entity = new RequestDetails(dbTap.toString(), RequestDetails.Method.PUT);
//        return new GenericInvokableBuilderImpl<DbTap>(client, entity, DbTap.class, "db_taps", Integer.toString(dbTapId));
//    }
//
//    @Override
//    public PageableInvokableBuilder<DbTapList> list()
//    {
//        return new GenericPageableInvokableBuilderImpl<DbTapList>(client, RequestDetails.retry(), DbTapList.class, "db_taps");
//    }
//
//    @Override
//    public InvokableBuilder<DbTap> view(int dbTapId)
//    {
//        return new GenericInvokableBuilderImpl<DbTap>(client, RequestDetails.retry(), DbTap.class, "db_taps", Integer.toString(dbTapId));
//    }
//
//    @Override
//    public InvokableBuilder<List<String>> listTables(int dbTapId)
//    {
//        GenericType<List<String>> responseType = new GenericType<List<String>>(){};
//        return new GenericInvokableBuilderImpl<List<String>>(client, RequestDetails.retry(), responseType, "db_taps", Integer.toString(dbTapId), "tables");
//    }
//
//    @Override
//    public InvokableBuilder<Status> delete(int dbTapId)
//    {
//        RequestDetails entity = new RequestDetails(null, RequestDetails.Method.DELETE);
//        return new GenericInvokableBuilderImpl<Status>(client, entity, Status.class, "db_taps", Integer.toString(dbTapId));
//    }
//
//    @Override
//    public DbTapBuilder dbTap()
//    {
//        return new DbTapBuilderImpl();
//    }
//
    NotebookApiImpl(QdsClient client)
    {
        this.client = client;
    }
//
//    public InvokableBuilder<SchemaList> getSchemaNames(int dbTapId)
//    {
//        RequestDetails requestDetails = new RequestDetails(null, RequestDetails.Method.GET, Maps.newHashMap(ImmutableMap.of("describe", "false")));
//        return new GenericInvokableBuilderImpl<SchemaList>(client, requestDetails, SchemaList.class, "db_taps", Integer.toString(dbTapId), "schemas");
//    }
//
//    public PageableInvokableBuilder<SchemaListDescribed> getSchemaListDescribed(int dbTapId)
//    {
//        RequestDetails requestDetails = new RequestDetails(null, RequestDetails.Method.GET, Maps.newHashMap(ImmutableMap.of("describe", "true")));
//        return new GenericPageableInvokableBuilderImpl<SchemaListDescribed>(client, requestDetails, SchemaListDescribed.class, "db_taps", Integer.toString(dbTapId), "schemas");
//    }
}
