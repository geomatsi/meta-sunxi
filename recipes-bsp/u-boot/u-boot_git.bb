DESCRIPTION = "U-Boot port for sunxi"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet

COMPATIBLE_MACHINE = "(bananapi|cubieboard|cubieboard2|cubietruck|forfun-q88db|mele|meleg|olinuxino-a10|olinuxino-a10lime|olinuxino-a10s|olinuxino-a13|olinuxino-a13som|olinuxino-a20|olinuxino-a20lime|olinuxino-a20lime2|olinuxino-a20som|pcduino-lite-wifi)"

DEFAULT_PREFERENCE_bananapi="1"
DEFAULT_PREFERENCE_cubieboard="1"
DEFAULT_PREFERENCE_cubieboard2="1"
DEFAULT_PREFERENCE_cubietruck="1"
DEFAULT_PREFERENCE_forfun-q88db="1"
DEFAULT_PREFERENCE_mele="1"
DEFAULT_PREFERENCE_meleg="1"
DEFAULT_PREFERENCE_olinuxino-a10="1"
DEFAULT_PREFERENCE_olinuxino-a10lime="1"
DEFAULT_PREFERENCE_olinuxino-a10s="1"
DEFAULT_PREFERENCE_olinuxino-a13="1"
DEFAULT_PREFERENCE_olinuxino-a13som="1"
DEFAULT_PREFERENCE_olinuxino-a20="1"
DEFAULT_PREFERENCE_olinuxino-a20lime="1"
DEFAULT_PREFERENCE_olinuxino-a20lime2="1"
DEFAULT_PREFERENCE_olinuxino-a20som="1"
DEFAULT_PREFERENCE_pcduino-lite-wifi="1"

SRC_URI = "git://github.com/geomatsi/u-boot-sunxi.git;protocol=git;branch=sunxi"

PE = "1"

PV = "v2014.04+git${SRCPV}"
# Corresponds 2014.04 in Makefile
SRCREV = "de4fddc5f7f9b077b9bbe77f60096d8b1eafba09"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SPL_BINARY="u-boot-sunxi-with-spl.bin"
