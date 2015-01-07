package org.anarres.ipmi.protocol.packet.rmcp;

import org.anarres.ipmi.protocol.packet.common.Wireable;
import java.net.SocketAddress;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public interface Packet extends Wireable {

    /**
     * Returns the remote address from which this packet was received, or to which it will be sent.
     */
    @Nonnull
    public SocketAddress getRemoteAddress();

    /**
     * Returns the RMCP payload of this packet.
     */
    // @CheckForNull
    public RmcpData getData();

    /**
     * Sets the RMCP payload of this packet.
     */
    @Nonnull
    public Packet withData(@Nonnull RmcpData data);
}