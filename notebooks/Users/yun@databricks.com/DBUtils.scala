// Databricks notebook source exported at Fri, 22 Apr 2016 01:09:15 UTC
dbutils.fs.ls("/mnt")
// changes!!!!

// COMMAND ----------

dbutils.fs.mounts()

// COMMAND ----------

fs.put("/mnt/yun/hello%20testing", "no-secrets")
display(fs.ls("/mnt/yun/hello%20testing"))

// COMMAND ----------



// COMMAND ----------



// COMMAND ----------



// COMMAND ----------

display(fs.mounts())

// COMMAND ----------

fs.unmount("/mnt/no-encryption/")
fs.unmount("/mnt/sse-s3-encryption/")
fs.unmount("/mnt/sse-kms-encryption/")


// COMMAND ----------

fs.help("mount")

// COMMAND ----------

dbutils.fs.mv("/hellotest", "hellotest1")

// COMMAND ----------

dbutils.fs.ls("/0")

// COMMAND ----------

