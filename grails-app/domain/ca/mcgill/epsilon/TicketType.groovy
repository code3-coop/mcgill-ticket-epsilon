package ca.mcgill.epsilon

class TicketType {
  String key
  String description

  static constraints = {
    key blank:false
    description blank:false
  }
}
