Compiler = javac
Runner = java

Main_class = Main
Bin_dir = ./bin
Files = Main.java
# CSS = /home/kuraterut/Desktop/HSE/my_projects/JavaProjects/VeronichkaNails_App/src



# Use ANSI color codes:
BRED    = \033[1;31m
BGREEN  = \033[1;32m
BYELLOW = \033[1;33m
GREEN   = \033[1;35m
BCYAN   = \033[1;36m
RESET   = \033[0m



default: $(Main_class)

# Link all object files together to obtain a binary:
# NOTE: all object files will be built first.
$(Main_class): $(Files) Makefile
	@mkdir -p $(Bin_dir)
	$(Compiler) -d $(Bin_dir) $(Files)

run: $(Main_class) Makefile
	$(Runner)  -cp $(Bin_dir) $(Main_class)


Help: Help.java Makefile
	@mkdir -p $(Bin_dir)
	$(Compiler) -d $(Bin_dir)  Help.java 

help: Help Makefile
	$(Runner) -cp $(Bin_dir) Help



clean:
	@printf "$(BYELLOW)Cleaning build directory $(RESET)\n"
	rm -rf $(Bin_dir)

# List of non-file targets:
.PHONY: run clean default
	

