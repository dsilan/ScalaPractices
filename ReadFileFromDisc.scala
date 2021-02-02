package org.example

import scala.io.{Codec, Source}

object ReadFileFromDisc {
  def loadMovieNames() : Map[Int, String] = {
    //handle character encoding issues - not ut8 just for the data in u.item file
    implicit val codec: Codec = Codec("ISO-8859-1")
    var movieNames: Map[Int, String] = Map()
    var lines = Source.fromFile("data/ml-100k/u.item") //read data from local disc

    for(line <- lines.getLines()){
      val fields = line.split('|')
      if(fields.length >1){
        movieNames += (fields(0).toInt -> fields(1))
      }
    }
    lines.close()

    movieNames
  }
}
