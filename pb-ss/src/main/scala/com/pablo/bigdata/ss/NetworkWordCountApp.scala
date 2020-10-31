package com.pablo.bigdata.ss

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * 完成基于ss进行词频统计分析
 * 数据源：nc
 *
 * ss的编程范式：
 * 1) ssc <== sparkConf
 * 2) 业务逻辑
 * 3) 启动流作业
 */
object NetworkWordCountApp {

  def main(args: Array[String]): Unit = {
    //入口点
    val sparkConf = new SparkConf()
      .setAppName(this.getClass.getSimpleName)
      .setMaster("local[2]")
    // 指定间隔5s为一个批次
    val ssc:StreamingContext = new  StreamingContext(sparkConf, Seconds(5))

    // TODO... 对接网络数据
    val lines = ssc.socketTextStream("172.19.241.103", 9527)

    // TODO... 业务逻辑处理
    // 输入数据以逗号分割
    val result = lines.flatMap(_.split(",")).map((_,1)).reduceByKey(_+_)
    result.print()
    //启动
    ssc.start()
    ssc.awaitTermination()
  }

}
