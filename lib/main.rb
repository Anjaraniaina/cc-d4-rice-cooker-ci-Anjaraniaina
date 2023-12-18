require_relative 'rice_cooker_service'

class Main
  @@rice_cooker_service = RiceCookerService.new(false, true, false)

  def self.welcome
    puts 'What do you want to do?'
  end

  def self.menu
    puts <<~MENU
      Type a number between the given choices:
        1. Plug in.
        2. Pour water.
        3. Put ingredient.
        4. Start.
        5. Unplug.
        6. Do something else.
    MENU

    choice = Utils.int_scanner
    result = ''

    case choice
    when 1
      result = @@rice_cooker_service.plug_in
    when 2
      result = @@rice_cooker_service.pour_water
    when 3
      result = @@rice_cooker_service.put_ingredient
    when 4
      result = @@rice_cooker_service.start
    when 5
      result = @@rice_cooker_service.unplug
    when 6
      result = 'You chose to do something else.'
    else
      result = 'Invalid choice. Try again.'
    end

    puts result

    menu unless result == 'You chose to do something else.'
  end

end

Main.welcome
Main.menu