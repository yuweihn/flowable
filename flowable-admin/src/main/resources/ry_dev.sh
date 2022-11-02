#!/bin/bash
source /etc/profile

jdk_path=${1}
prj_name='flowable-admin'
if  [ ! -n "${jdk_path}" ] ;then
    jdk_path='java'
fi

ID=`ps -ef|grep ${prj_name}.jar | grep java | awk '{print $2}'`
for id in $ID
do
  kill -9 $id
  echo "killed $id"
done
sleep 1

${jdk_path} -Xms100m -Xmx100m -XX:MetaspaceSize=30m -XX:MaxMetaspaceSize=128m -XX:+UseG1GC -XX:InitiatingHeapOccupancyPercent=45 -XX:MaxGCPauseMillis=200 -Xloggc:gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=5m -jar ${prj_name}.jar dev >/dev/null 2>&1&
sleep 1

echo "ok......"
