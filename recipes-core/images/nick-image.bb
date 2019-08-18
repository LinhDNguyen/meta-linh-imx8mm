# This image extends fsl-image-multimedia-full with additional
# Boundary Devices packages

require recipes-boundary/images/boundary-image-multimedia-full.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	hello-world \
"
