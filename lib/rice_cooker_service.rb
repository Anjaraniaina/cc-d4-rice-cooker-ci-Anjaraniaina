class RiceCookerService
  attr_accessor :is_plugged_in, :is_empty, :contains_water

  def initialize(is_plugged_in, is_empty, contains_water)
    @is_plugged_in = is_plugged_in
    @is_empty = is_empty
    @contains_water = contains_water
  end

  def pour_water
    if !@contains_water
      @contains_water = true
      @is_empty = false
      'You poured water.'
    else
      "There's already water."
    end
  end

  def put_ingredient
    @is_empty = false
    'You put ingredient in.'
  end

  def check_if_cooked_without_water
    !@is_empty && !@contains_water
  end

  def plug_in
    if !@is_plugged_in
      @is_plugged_in = true
      'You plugged in. The rice cooker is ready to use.'
    else
      "It's already plugged in."
    end
  end

  def start
    if !@is_plugged_in
      'The rice cooker is not plugged in yet.'
    else
      if @is_empty
        'There\'s nothing to cook yet in the rice cooker.'
      elsif check_if_cooked_without_water
        'You put ingredient without water.'
      else
        "Ok\nYou can eat now."
      end
    end
  end

  def unplug
    @is_plugged_in = false
    'You unplugged the rice cooker.'
  end
end