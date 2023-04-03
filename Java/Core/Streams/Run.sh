if [ -d "./bin" ]; then
  rm -r ./bin
fi
javac -d ./bin/ ./src/*.java
cd bin
java -cp . Runner