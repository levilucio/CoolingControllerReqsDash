# CoolingControllerReqsDash

An implementation of a flow process for assisting the user when writing requirements for the Cooling Controller

Video demo: under construction.....

## Install instructions

1. Install MPS 3.4.3 (https://confluence.jetbrains.com/display/MPS/JetBrains+MPS+3.4+Download+Page)

2. Install the _mbeddr_ plugins (follow the instructions at http://mbeddr.com/download.html)

3. Clone this repository locally:

    `git clone https://github.com/levilucio/CoolingControllerReqsDash`


4. Start MPS and open the _org.iets3.opensource_ project at:

    `your_repo_root/code/languages`

### Requirement statement used for the Demo

Use the following requirement statement for the demo purpose,

The cooling controller shall cool down the hardware board by adjusting the speed of the fan to an appropriate duty cycle. The duty cycle depends on the current temperature of the hardware and whether that temperature is increasing between minValueIncrease and maxValueIncrease , or decreasing between a minValueDecrease and a maxValueDecrease
