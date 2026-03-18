class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {    
        int now = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int start = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int end = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
        int video = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        
        for (String command : commands) {
            now = skip(now, start, end);
            switch (command) {
                case "prev" :
                    now = prev(now);
                    break;
                case "next" :
                    now = next(now, video);
                    break;
            }
            now = skip(now, start, end);
        }
        if (now <= 0) return "00:00";
        if (now > video) return video_len;
        
        String mm = (now/60)/10 > 0 ? "" + now/60 : "0" + now/60;
        String ss = (now%60)/10 > 0 ? "" + now%60 : "0" + now%60;
        
        return mm + ":" + ss;
    }
    
    private static int prev (int now) {
        now -= 10;
        if (now < 0) return 0;
        return now;
    }
    
    private static int next (int now, int video) {
        now += 10;
        if (now > video) return video;
        return now;
    }
    
    private static int skip (int now, int start, int end) {
        if (now >= start && now <= end) return end;
        return now;
    }
}