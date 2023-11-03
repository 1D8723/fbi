#!/bin/ksh
# COPYRIGHT LICENSE: 
# This information contains sample code provided in source code form. You may 
# copy, modify, and distribute these sample programs in any form without 
# payment to IBM for the purposes of developing, using, marketing or 
# distributing application programs conforming to the application programming
# interface for the operating platform for which the sample code is written. 
# Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE
# ON AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, 
# INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF 
# MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, 
# TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE 
# LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES
# ARISING OUT OF THE USE OR OPERATION OF THE SAMPLE SOURCE CODE. IBM HAS NO 
# OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS OR 
# MODIFICATIONS TO THE SAMPLE SOURCE CODE.

SCRIPTS_DIR=`dirname $0`
cd "${SCRIPTS_DIR}"
. ./setupSamp.sh $*
if [ $? -eq 1 ]  
then       
  exit 1   
else         
  cd "$SAMPLES_HOME/installableApps"
  "${WAS_HOME}/bin/wsadmin.sh" ${PROFOPT} -conntype none -lang jython -c "AdminApp.install('JaxWSServicesSamples.ear', ['-appname', 'JaxWSServicesSamples', '-usedefaultbindings', '-node', '$WAS_NODE', '-server', '$WAS_SERVER' ] )"
fi
exit 0
