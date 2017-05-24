


        Socket sock = new Socket("127.0.0.1", 5000);
        String message1 = "Accept best wishes server";

        OutputStream ostream = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ostream);

        dos.writeBytes(message1);
        dos.close();
        ostream.close();
        sock.close();
    }

}
