#!/usr/bin/env bash


cd target
scp -P 7822 lux_community.war root@185.146.20.48:/root/lux_community.war
cd ..
scp -P 7822 lux_community_restart.sh root@185.146.20.48:/root/lux_community_restart.sh

cd target
scp lux_community.war root@212.224.118.153:/root/lux_community.war
cd ..
scp lux_community_restart.sh root@212.224.118.153:/root/lux_community_restart.sh
