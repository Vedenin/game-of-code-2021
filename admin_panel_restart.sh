#!/usr/bin/env bash

set -x #echo on

javaId=$(pidof java) || true

kill -9 $javaId || true

java -jar admin_panel.war &

sleep 15