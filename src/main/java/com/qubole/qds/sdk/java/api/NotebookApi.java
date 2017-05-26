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
package com.qubole.qds.sdk.java.api;

import com.qubole.qds.sdk.java.entities.Notebook;
import com.qubole.qds.sdk.java.entities.Status;

/**
 * Corresponds to http://www.qubole.com/docs/documentation/dbtaps-api-qds-api-reference/
 */
public interface NotebookApi
{
    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/create-notebook.html
     *
     * @param notebook the data
     * @return new builder
     */
    InvokableBuilder<Notebook> create(NotebookBuilder notebook);

    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/configure-notebook.html
     *
     * @param dbTapId id to edit
     * @param dbTap the data
     * @return new builder
     */
    InvokableBuilder<Notebook> configure(int dbTapId, NotebookBuilder dbTap);

    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/clone-notebook.html
     *
     * @return new builder
     */
    InvokableBuilder<Notebook> clone();

    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/bind-notebook.html
     *
     * @param dbTapId id to view
     * @return new builder
     */
    InvokableBuilder<Notebook> bind(int dbTapId);

    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/run-notebook.html
     *
     * @param dbTapId id to list
     * @return new builder
     */
    InvokableBuilder<Notebook> run(int dbTapId);

    /**
     * Corresponds to http://docs.qubole.com/en/latest/rest-api/notebook_api/delete-notebook.html
     *
     * @param dbTapId id to delete
     * @return new builder
     */
    InvokableBuilder<Status> delete(int dbTapId);

    /**
     * Return a new db tap builder. Can be used with
     * apis such as {@link #create(NotebookBuilder)}
     *
     * @return builder
     */
    NotebookBuilder notebook();
}
