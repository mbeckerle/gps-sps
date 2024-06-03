package com.owlcyberdefense.gpssps.gpssps

import org.apache.daffodil.tdml.Runner

import org.junit.AfterClass
import org.junit.Test

object TestGpssps {
  lazy val runner = Runner("/com/owlcyberdefense/gpssps/", "TestGpssps.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestGpssps {

  import TestGpssps._

  @Test def test_gpssps_01(): Unit = {
    runner.runOneTest("test_gpssps_01")
  }
}
