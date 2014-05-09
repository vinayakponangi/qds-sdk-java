package com.qubole.qds.sdk.java.details;

import com.qubole.qds.sdk.java.api.InvokableBuilder;
import com.qubole.qds.sdk.java.client.QdsClient;
import com.qubole.qds.sdk.java.entities.CommandResponse;
import org.codehaus.jackson.node.ObjectNode;
import java.io.IOException;
import java.util.concurrent.Future;

abstract class CommandBuilderImplBase implements InvokableBuilder<CommandResponse>
{
    private final QdsClient client;
    private final ClientEntity.Method method;

    @Override
    public final Future<CommandResponse> invoke()
    {
        ObjectNode node = getEntity();
        String json;
        try
        {
            json = QdsClientImpl.getMapper().writeValueAsString(node);
        }
        catch ( IOException e )
        {
            throw new RuntimeException("Could not serialize " + node, e);
        }
        ClientEntity entity = new ClientEntity(json, method);
        return client.invokeRequest(null, entity, CommandResponse.class, "commands");
    }

    protected abstract ObjectNode getEntity();

    protected CommandBuilderImplBase(QdsClient client)
    {
        this(client, ClientEntity.Method.POST);
    }

    protected CommandBuilderImplBase(QdsClient client, ClientEntity.Method method)
    {
        this.client = client;
        this.method = method;
    }
}
