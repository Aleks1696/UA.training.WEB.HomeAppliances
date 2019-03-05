package com.model.dataBase;

import com.model.entity.Socket;

import java.util.ArrayList;
import java.util.List;

public enum Sockets {
    SOCKET_1(new Socket(1)), SOCKET_2(new Socket(4)),
    SOCKET_3(new Socket(3));

    private Socket socket;

    Sockets(Socket socket) {
        this.socket = socket;
    }

    public static List<Socket> getAllSockets() {
        List<Socket> socketList = new ArrayList<>();
        for (Sockets socket : Sockets.values()) {
            socketList.add(socket.socket);
        }
        return socketList;
    }

    public static Socket getSocket(Sockets sockets) {
        return sockets.socket;
    }
}
