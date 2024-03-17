package zxy.birch

case class Config(master: String = "", dataFile: String = "", labelFile: String = "",
                  resFile: String = "", logFile: String = "",
                  nPartitions: Int = -1, nClusters: Int = -1, nIterations: Int = -1,
                  memLimit: Int = -1, memCheckPeriod: Int = -1)
