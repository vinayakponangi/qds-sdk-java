/*
 * Copyright Homeaway, Inc 2013-Present. All Rights Reserved
 * No unauthorized use of this software.
 */
package com.qubole.qds.sdk.java.api;

public interface NotebookBuilder {

    NotebookBuilder name(String name);

    NotebookBuilder location(String location);

    NotebookBuilder note_type(String note_type);

    NotebookBuilder cluster_id(String cluster_id);
}
