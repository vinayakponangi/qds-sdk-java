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

import com.qubole.qds.sdk.java.api.NotebookBuilder;
import org.codehaus.jackson.node.ObjectNode;

import java.io.IOException;

class NotebookBuilderImpl implements NotebookBuilder
{
    private final ObjectNode node = QdsClientImpl.getMapper().createObjectNode();

    @Override
    public NotebookBuilder name(String name)
    {
        node.put("name", name);
        return this;
    }

    @Override
    public NotebookBuilder location(String location)
    {
        node.put("location", location);
        return this;
    }

    @Override
    public NotebookBuilder note_type(String note_type)
    {
        node.put("note_type", note_type);
        return this;
    }

    @Override
    public NotebookBuilder cluster_id(String cluster_id)
    {
        node.put("cluster_id", cluster_id);
        return this;
    }

    @Override
    public String toString()
    {
        try
        {
            return QdsClientImpl.getMapper().writer().writeValueAsString(node);
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not serialize: " + node, e);
        }
    }
}
