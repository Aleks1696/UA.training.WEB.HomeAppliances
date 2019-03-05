package com.model.dataBase;

import com.model.entity.Socket;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SocketsTest {

    @Test
    public void getAllSockets() {
        List<Socket> allSocketsFromDB = Sockets.getAllSockets();
        assertTrue(allSocketsFromDB.contains(Sockets.getSocket(Sockets.SOCKET_1)));
        assertTrue(allSocketsFromDB.contains(Sockets.getSocket(Sockets.SOCKET_2)));
        assertTrue(allSocketsFromDB.contains(Sockets.getSocket(Sockets.SOCKET_3)));
    }
}