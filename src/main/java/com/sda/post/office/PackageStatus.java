package com.sda.post.office;

enum PackageStatus {
    SENT("wysłana", 100){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[] { TRAVELLING, LOST};
        }
    },
    TRAVELLING("w drodze", 200){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[] { COURIER, LOST};
        }
    },
    COURIER("w doreczeniu", 300){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[] { DELIVERED, LOST, RETURNED};
        }
    },
    DELIVERED("dostarczone", 400){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    },
    LOST("zagubiona", 500){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    },
    RETURNED("zwrocona", 900){
        @Override
        public PackageStatus[] getNextStatuses() {
            return new PackageStatus[0];
        }
    };

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

    public abstract PackageStatus[] getNextStatuses();


    @Override
    public String toString() {
        return "PackageStatus{" +
                "message='" + message + '\'' +
                ", code=" + code +
                "} " + super.toString();
    }


}
