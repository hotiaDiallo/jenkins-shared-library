#!/usr/bin/env groovy
import com.korner.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}
