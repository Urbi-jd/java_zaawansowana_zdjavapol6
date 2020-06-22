package com.sda.post.office;

enum PackageStatus {
    SENT("wysłana", 100),
    TRAVELLING("w drodze", 200),
    COURIER("w doreczeniu", 300),
    DELIVERED("dostarczone", 400),
    LOST("zagubiona", 500),
    RETURNED("zwrocona", 900);

    private final String message;
    private final int code;

    PackageStatus(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "message='" + message + '\'' +
                ", code=" + code +
                "} " + super.toString();
    }
}
