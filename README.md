# Wxtyt_POST_DATA
微信跳一跳小游戏抓包修改分数，Java实现
#### Usage
````
String sessionid = "session_id";//session_id值
String score = "100";//分数
String result = Util.postData(score,  sessionid);//执行请求
System.out.println(result);//输出分数
````