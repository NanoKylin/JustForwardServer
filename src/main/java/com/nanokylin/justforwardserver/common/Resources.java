package com.nanokylin.justforwardserver.common;

import com.nanokylin.justforwardserver.service.ThreadPoolService;
import org.java_websocket.WebSocket;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 存储一部分的Static变量到这里
 */
public class Resources {
    // ################ List ################ //
    // 文件列表
    public static ArrayList<String> DependFile = new ArrayList<>();

    // ################ Map ################ //
    // 配置文件Map
    public static HashMap<String, Object> ConfigMap = new HashMap<>();
    // 语言Map
    public static HashMap<String, Object> LanguageMap = new HashMap<>();
    // WebSocket连接池Map
    public static HashMap<WebSocket, String> WebSocketUserMap = new HashMap<>();

    // ################ Thread Info ################ //
    // 当线程数小于 corePoolSize时，创建线程执行任务
    // 当线程数大于等于 corePoolSize并且 workQueue 没有满时，放入workQueue中
    // 线程数大于等于 corePoolSize并且当 workQueue 满时，新任务新建线程运行
    // 线程总数要小于 maximumPoolSize
    // 当线程总数等于 maximumPoolSize 并且 workQueue
    // 满了的时候执行 handler 的 rejectedExecution。也就是拒绝策略
    // 线程池对拒绝任务的处理策略：
    // AbortPolicy为抛出异常；
    // CallerRunsPolicy为重试添加当前的任务，他会自动重复调用execute()方法；
    // DiscardOldestPolicy为抛弃旧的任务，
    // DiscardPolicy为抛弃当前的任务
    // private static final TimeUnit UNIT = TimeUnit.SECONDS;
    // private static final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(3);
    // private static final ThreadPoolExecutor.AbortPolicy HANDLER = new ThreadPoolExecutor.AbortPolicy();
    // ################ Thread ################ //
    // 线程池对象
    public static ThreadPoolService threadPool;

    // ################ DataBase ################ //
    // SQLite
    public static Connection SQLLiteConnection = null;
    public static Connection MySQLConnection = null;
}
