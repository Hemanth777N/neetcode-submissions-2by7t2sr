class TimeStampedValue{
    public int timestamp;
    public String value;

    public TimeStampedValue(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}
class TimeMap {
    Map<String,ArrayList<TimeStampedValue>> entriedByKey;
    public TimeMap() {
        entriedByKey = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!entriedByKey.containsKey(key)){
            entriedByKey.put(key, new ArrayList<>());
        }
        ArrayList<TimeStampedValue> timestampedvalue = entriedByKey.get(key);
        timestampedvalue.add(new TimeStampedValue(timestamp, value));
        
        
    }
    
    public String get(String key, int timestamp) {
        if(!entriedByKey.containsKey(key)){
            return "";
        }
        ArrayList<TimeStampedValue> timestampedvalue = entriedByKey.get(key);
        Optional<TimeStampedValue> timeStamp = bs(timestampedvalue, timestamp);

        if(timeStamp.isEmpty()){
            return "";
        }
        return timeStamp.get().value;

        
    }

    private Optional<TimeStampedValue> bs(ArrayList<TimeStampedValue> arr, int target){
        int left = 0;
        int right = arr.size() - 1;
        int matchIndex = -1;

        while(left <=right){
            int mid = (left+right)/2;
            TimeStampedValue cur = arr.get(mid);
            if(cur.timestamp <=target){
                matchIndex = mid;
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        if(matchIndex == -1){
            return Optional.empty();
        }
        return Optional.of(arr.get(matchIndex));

    }
}
