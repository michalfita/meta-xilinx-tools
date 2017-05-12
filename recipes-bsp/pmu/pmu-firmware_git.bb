DESCRIPTION = "PMU Firmware"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://license.txt;md5=d19cfdb99d9e373dc66709f39fc861fd"

PROVIDES = "virtual/pmufw"

inherit xsctapp xsctyaml deploy

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE_zynqmp = "zynqmp"

XSCTH_COMPILER_DEBUG_FLAGS = "-O2 -DDEBUG_MODE -DENABLE_EM"
XSCTH_PROC_zynqmp = "psu_pmu_0"
XSCTH_APP  = "ZynqMP PMU Firmware"

do_deploy_append() {
    ln -sf ${PN}-${MACHINE}.elf ${DEPLOYDIR}/pmu-${MACHINE}.elf
}
