

    static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int arr[]={};
            return arr;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            int arr[]= new int [3];
            for(int i=0;i<3;i++){
                arr[i]=i;
            }
            return arr;
        }

        public static int get_expected_result() {
            // complete this function
            int arr[]= new int [3];
            for(int i=0;i<3;i++){
                arr[i]=i;
            }
            return arr[0];
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            int arr[]= {5,1,4,3,2,2,1};
            return arr;
        }

        public static int get_expected_result() {
            // complete this function
            int arr[]= {5,1,4,3,2,2,1};
            return arr[1];
        }
    }

