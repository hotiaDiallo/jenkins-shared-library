#!/usr/bin/env groovy
import com.korner.Docker

def call() {
    return new Docker(this).dockerLogin()
}
