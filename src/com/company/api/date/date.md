
【代码清单】
cn.itcast.api.a.date
	|--DateDemo.java：将毫秒值转成本地格式。Date DateFormat
	|--DateDemo2.java：获取日期中的指定日期信息比如获取年，月，日Calendar。
	|--DateTest.java：练习2 ："2012-3-17"转成日期对象。
	|--DateTest2.java：练习3："2013-4-25"到"2013年7月29日"到底有多少天？
	|--DateTest3.java：练习4：获取给定年份的2月有多少天？【面试题】
	
	【阶段一】
    		【目标：对日期时间的操作】
    			1，开发时，经常会使用日期和时间。
    			自己动手查API。解决如下问题：★★★★★
    			日期的简单使用。java.util.Date,通过System.currentTimeMillis()的另请参见。
    			2，获取的毫秒值怎么转成我们习惯的日期时间格式呢？
    			Date，DateForamt。
    			3，转换
    				3.1 毫秒值time--new Date(time) ,  date.setTime(time)-->日期对象date。
    				3.2 日期对象date--date.getTime()-->毫秒值time
    				3.3 格式化：日期对象date --DateFormat.getDateInstance(style).format(date)-->文本
    				3.4 解析：文本 --DateFormat.getDateInstance(style).parse(文本)-->日期对象date
    			4，获取DateFormat对象的几种方式。style: FULL LONG MEDIUM SHORT
    				4.1 getDateInstance(datestyle);
    				4.2 getDateTimeInstance(datestyle,timestyle);
    				4.3 new SimpleDateFormat(pattern)。
    			5，获取日期中的具体的字段。年 月 日 等。
    				5.1 使用Calendar对象。
    				5.2 get set add(对指定字段进行偏移 )
    		【学习结果】
    			1，实际开发中，如何查找到Date DateFormat  Calendar 必须会。查询新对象解决问题的能力一定要会。
    				技巧：1，索引指定类或者接口。2，另请参见。3，阅读文档描述。
    			2，将日期涉及练习做完。动手写。
    				2.1,将毫秒值转成 指定的日期的格式   xxxx年xx月xx日   hh:mm:ss
    					步骤：
    					//1,毫秒值time--->Date
    					Date date = new Date(time);
    					//2,通过日期时间格式器对象DateFormat对日期对象进行格式化(日期--->文本字符串)
    					DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
    					String str_time = format.format(date);
    					System.out.println(str_time);
    				2.2,"2012/3/17"转成日期对象。
    				2.3,"2013-4-25"到"2013年7月29日"到底有多少天？
    				2.4,获取给定年份的2月有多少天？【面试题】