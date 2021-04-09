#!/usr/bin/env bash

cd target
scp -P 7822 admin_panel.war root@185.146.20.48:/root/admin_panel.war
scp admin_panel.war root@212.224.118.153:/root/admin_panel.war
