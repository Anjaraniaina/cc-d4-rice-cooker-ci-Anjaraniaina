class Utils
  @@scanner = STDIN

  def self.print(sentence)
    puts sentence
  end

  def self.int_scanner
    begin
      return @@scanner.gets.chomp.to_i
    rescue
      print("Invalid input")
      @@scanner.gets # consume the invalid input
    end
    return 0
  end

  def self.not_implemented
    print 'Not implemented yet.'
  end

  def self.quit
    print 'See you later!'
  end
end